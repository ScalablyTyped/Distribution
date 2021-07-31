package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Column = typings.pdfmake.interfacesMod.Content & typings.pdfmake.anon.Width

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.pdfmake.interfacesMod.ArrayOfContent
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
type Content = typings.pdfmake.interfacesMod._Content | java.lang.String

type DynamicBackground = js.Function2[
/* currentPage */ scala.Double, 
/* pageSize */ typings.pdfmake.interfacesMod.ContextPageSize, 
js.UndefOr[typings.pdfmake.interfacesMod.Content | scala.Null]]

type DynamicContent = js.Function3[
/* currentPage */ scala.Double, 
/* pageCount */ scala.Double, 
/* pageSize */ typings.pdfmake.interfacesMod.ContextPageSize, 
js.UndefOr[typings.pdfmake.interfacesMod.Content | scala.Null]]

type DynamicLayout[T] = js.Function3[
/* rowIndex */ scala.Double, 
/* node */ typings.pdfmake.interfacesMod.ContentTable, 
/* columnIndex */ scala.Double, 
js.UndefOr[T | scala.Null]]

type DynamicRowSize = js.Function1[/* row */ scala.Double, scala.Double | typings.pdfmake.pdfmakeStrings.auto]

type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])

type OrderedListElement = typings.pdfmake.interfacesMod.Content & typings.pdfmake.anon.Counter

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.pdfmake.pdfmakeStrings.auto
  - typings.pdfmake.pdfmakeStrings.Asterisk
  - java.lang.String
*/
type Size = typings.pdfmake.interfacesMod._Size | scala.Double | java.lang.String

type StyleDictionary = org.scalablytyped.runtime.StringDictionary[typings.pdfmake.interfacesMod.Style]

type TFontDictionary = org.scalablytyped.runtime.StringDictionary[typings.pdfmake.interfacesMod.TFontFamilyTypes]

type TableCell = js.Object | (typings.pdfmake.interfacesMod.Content & typings.pdfmake.anon.Border)

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.pdfmake.interfacesMod.PredefinedTableLayout
  - typings.pdfmake.interfacesMod.CustomTableLayout
*/
type TableLayout = typings.pdfmake.interfacesMod._TableLayout | java.lang.String

type UnorderedListElement = typings.pdfmake.interfacesMod.Content & typings.pdfmake.anon.ListType
