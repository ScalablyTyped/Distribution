package typings.mustache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type COMMENT = typings.mustache.mustacheStrings.Exclamationmark
  
  type EQUAL = typings.mustache.mustacheStrings.Equalssign
  
  type ESCAPED_VALUE = typings.mustache.mustacheStrings.name
  
  type INVERTED = typings.mustache.mustacheStrings.^
  
  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[java.lang.String, java.lang.String]
  
  type PARTIAL = typings.mustache.mustacheStrings.Greaterthansign
  
  type PartialLookupFn = js.Function1[/* partialName */ java.lang.String, js.UndefOr[java.lang.String]]
  
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (typings.std.Record[java.lang.String, java.lang.String]) | typings.mustache.mod.PartialLookupFn
  
  type RAW_VALUE = typings.mustache.mustacheStrings.text
  
  type SECTION = typings.mustache.mustacheStrings.Numbersign
  
  type TemplateSpanType = typings.mustache.mod.RAW_VALUE | typings.mustache.mod.ESCAPED_VALUE | typings.mustache.mod.SECTION | typings.mustache.mod.UNESCAPED_VALUE | typings.mustache.mod.INVERTED | typings.mustache.mod.COMMENT | typings.mustache.mod.PARTIAL | typings.mustache.mod.EQUAL
  
  type UNESCAPED_VALUE = typings.mustache.mustacheStrings.Ampersand
}
