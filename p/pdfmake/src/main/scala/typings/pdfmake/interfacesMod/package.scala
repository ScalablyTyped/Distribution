package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfmake.pdfmakeStrings.auto
import typings.pdfmake.pdfmakeStrings.canvas
import typings.pdfmake.pdfmakeStrings.columns
import typings.pdfmake.pdfmakeStrings.image
import typings.pdfmake.pdfmakeStrings.ol
import typings.pdfmake.pdfmakeStrings.pageReference
import typings.pdfmake.pdfmakeStrings.qr
import typings.pdfmake.pdfmakeStrings.stack
import typings.pdfmake.pdfmakeStrings.svg
import typings.pdfmake.pdfmakeStrings.table
import typings.pdfmake.pdfmakeStrings.text
import typings.pdfmake.pdfmakeStrings.textReference
import typings.pdfmake.pdfmakeStrings.toc
import typings.pdfmake.pdfmakeStrings.ul
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Column = Content & ColumnProperties

/** 
NOTE: Rewritten from type alias:
{{{
type Content = string | std.Array<pdfmake.pdfmake/interfaces.Content> | pdfmake.pdfmake/interfaces.ContentText | pdfmake.pdfmake/interfaces.ContentColumns | pdfmake.pdfmake/interfaces.ContentStack | pdfmake.pdfmake/interfaces.ContentUnorderedList | pdfmake.pdfmake/interfaces.ContentOrderedList | pdfmake.pdfmake/interfaces.ContentTable | pdfmake.pdfmake/interfaces.ContentAnchor | pdfmake.pdfmake/interfaces.ContentPageReference | pdfmake.pdfmake/interfaces.ContentTextReference | pdfmake.pdfmake/interfaces.ContentToc | pdfmake.pdfmake/interfaces.ContentTocItem | pdfmake.pdfmake/interfaces.ContentImage | pdfmake.pdfmake/interfaces.ContentSvg | pdfmake.pdfmake/interfaces.ContentQr | pdfmake.pdfmake/interfaces.ContentCanvas
}}}
to avoid circular code involving: 
- pdfmake.pdfmake/interfaces.Column
- pdfmake.pdfmake/interfaces.Content
*/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Any]
  - typings.pdfmake.interfacesMod.ContentText
  - typings.pdfmake.interfacesMod.ContentColumns
  - typings.pdfmake.interfacesMod.ContentStack
  - typings.pdfmake.interfacesMod.ContentUnorderedList
  - typings.pdfmake.interfacesMod.ContentOrderedList
  - typings.pdfmake.interfacesMod.ContentTable
  - typings.pdfmake.interfacesMod.ContentAnchor
  - typings.pdfmake.interfacesMod.ContentPageReference
  - typings.pdfmake.interfacesMod.ContentTextReference
  - typings.pdfmake.interfacesMod.ContentToc
  - typings.pdfmake.interfacesMod.ContentTocItem
  - typings.pdfmake.interfacesMod.ContentImage
  - typings.pdfmake.interfacesMod.ContentSvg
  - typings.pdfmake.interfacesMod.ContentQr
  - typings.pdfmake.interfacesMod.ContentCanvas
*/
type Content = _Content | js.Array[Any] | String

type DynamicCellLayout[T] = js.Function3[/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double, T | Null]

type DynamicLayout[T] = js.Function2[/* rowIndex */ Double, /* node */ ContentTable, T | Null]

type DynamicRowSize = js.Function1[/* rowIndex */ Double, Double | auto]

/**
  * Internal helper type to prevent TypeScript from allowing element definitions
  * that contain multiple element types at once.
  *
  * Advantages:
  * - Does not allow setting multiple element properties together (e.g. `ol` + `ul`)
  * - Does not allow using optional properties from other element types
  *
  * Disadvantages:
  * - `property in content` does not narrow the type any longer
  * - Autocompletion does not sort the primary element properties at the top
  * - Error messages are not very good
  */
type ForbidOtherElementProperties[TProperty /* <: text | columns | stack | ul | ol | table | pageReference | textReference | toc | image | svg | qr | canvas */] = Omit[ForbiddenElementProperties, TProperty]

type Margins = Double | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

/** 
NOTE: Rewritten from type alias:
{{{
type OrderedListElement = pdfmake.pdfmake/interfaces.Content & pdfmake.pdfmake/interfaces.OrderedListElementProperties
}}}
to avoid circular code involving: 
- pdfmake.pdfmake/interfaces.Content
- pdfmake.pdfmake/interfaces.OrderedListElement
*/
type OrderedListElement = Any & OrderedListElementProperties

type PatternFill = js.Tuple2[String, String]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.pdfmake.pdfmakeStrings.auto
  - typings.pdfmake.pdfmakeStrings.Asterisk
  - java.lang.String
*/
type Size = _Size | Double | String

type StyleDictionary = StringDictionary[Style]

type StyleReference = String | Style | (js.Array[String | Style])

type TFontDictionary = StringDictionary[TFontFamilyTypes]

/** 
NOTE: Rewritten from type alias:
{{{
type TableCell = {} | pdfmake.pdfmake/interfaces.Content & pdfmake.pdfmake/interfaces.TableCellProperties
}}}
to avoid circular code involving: 
- pdfmake.pdfmake/interfaces.Content
- pdfmake.pdfmake/interfaces.TableCell
*/
type TableCell = js.Object | (Any & TableCellProperties)

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.pdfmake.interfacesMod.PredefinedTableLayout
  - typings.pdfmake.interfacesMod.CustomTableLayout
*/
type TableLayout = _TableLayout | String

/** 
NOTE: Rewritten from type alias:
{{{
type UnorderedListElement = pdfmake.pdfmake/interfaces.Content & pdfmake.pdfmake/interfaces.UnorderedListElementProperties
}}}
to avoid circular code involving: 
- pdfmake.pdfmake/interfaces.Content
- pdfmake.pdfmake/interfaces.UnorderedListElement
*/
type UnorderedListElement = Any & UnorderedListElementProperties

type VerticalDynamicCellLayout[T] = js.Function3[/* columnIndex */ Double, /* node */ ContentTable, /* rowIndex */ Double, T | Null]

type VerticalDynamicLayout[T] = js.Function2[/* columnIndex */ Double, /* node */ ContentTable, T | Null]
