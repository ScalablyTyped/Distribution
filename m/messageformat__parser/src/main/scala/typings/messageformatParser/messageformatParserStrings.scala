package typings.messageformatParser

import typings.messageformatParser.libParserMod.PluralCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageformatParserStrings {
  
  @js.native
  sealed trait argument extends StObject
  inline def argument: argument = "argument".asInstanceOf[argument]
  
  @js.native
  sealed trait content extends StObject
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait few
    extends StObject
       with PluralCategory
  inline def few: few = "few".asInstanceOf[few]
  
  @js.native
  sealed trait function extends StObject
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait many
    extends StObject
       with PluralCategory
  inline def many: many = "many".asInstanceOf[many]
  
  @js.native
  sealed trait octothorpe extends StObject
  inline def octothorpe: octothorpe = "octothorpe".asInstanceOf[octothorpe]
  
  @js.native
  sealed trait one
    extends StObject
       with PluralCategory
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait other
    extends StObject
       with PluralCategory
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait plural extends StObject
  inline def plural: plural = "plural".asInstanceOf[plural]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectordinal extends StObject
  inline def selectordinal: selectordinal = "selectordinal".asInstanceOf[selectordinal]
  
  @js.native
  sealed trait two
    extends StObject
       with PluralCategory
  inline def two: two = "two".asInstanceOf[two]
  
  @js.native
  sealed trait zero
    extends StObject
       with PluralCategory
  inline def zero: zero = "zero".asInstanceOf[zero]
}
