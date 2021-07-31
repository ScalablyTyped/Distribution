package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageMode extends StObject
/**
  * Determines how the source image is used on the output DOM element.
  */
@JSGlobal("sap.m.ImageMode")
@js.native
object ImageMode extends StObject {
  
  @js.native
  sealed trait Background
    extends StObject
       with ImageMode
  
  @js.native
  sealed trait Image
    extends StObject
       with ImageMode
}
