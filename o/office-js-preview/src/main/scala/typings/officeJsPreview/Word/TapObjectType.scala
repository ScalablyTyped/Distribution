package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TapObjectType extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.TapObjectType")
@js.native
object TapObjectType extends StObject {
  
  @js.native
  sealed trait chart
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait image
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait ole
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait slide
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait smartArt
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait table
    extends StObject
       with TapObjectType
  
  @js.native
  sealed trait text
    extends StObject
       with TapObjectType
}
