package typings.parse5

import typings.parse5.mod.DocumentMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parse5Strings {
  
  @js.native
  sealed trait Numbersigncomment extends StObject
  inline def Numbersigncomment: Numbersigncomment = "#comment".asInstanceOf[Numbersigncomment]
  
  @js.native
  sealed trait Numbersigndocument extends StObject
  inline def Numbersigndocument: Numbersigndocument = "#document".asInstanceOf[Numbersigndocument]
  
  @js.native
  sealed trait `Numbersigndocument-fragment` extends StObject
  inline def `Numbersigndocument-fragment`: `Numbersigndocument-fragment` = "#document-fragment".asInstanceOf[`Numbersigndocument-fragment`]
  
  @js.native
  sealed trait NumbersigndocumentType extends StObject
  inline def NumbersigndocumentType: NumbersigndocumentType = "#documentType".asInstanceOf[NumbersigndocumentType]
  
  @js.native
  sealed trait Numbersigntext extends StObject
  inline def Numbersigntext: Numbersigntext = "#text".asInstanceOf[Numbersigntext]
  
  @js.native
  sealed trait `limited-quirks`
    extends StObject
       with DocumentMode
  inline def `limited-quirks`: `limited-quirks` = "limited-quirks".asInstanceOf[`limited-quirks`]
  
  @js.native
  sealed trait `no-quirks`
    extends StObject
       with DocumentMode
  inline def `no-quirks`: `no-quirks` = "no-quirks".asInstanceOf[`no-quirks`]
  
  @js.native
  sealed trait quirks
    extends StObject
       with DocumentMode
  inline def quirks: quirks = "quirks".asInstanceOf[quirks]
}
