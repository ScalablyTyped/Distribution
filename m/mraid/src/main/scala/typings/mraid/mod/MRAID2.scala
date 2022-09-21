package typings.mraid.mod

import typings.mraid.anon.PartialMRAIDExpandPropert
import typings.mraid.anon.PartialMRAIDOrientationPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mraid.mod.MRAID because Already inherited */ @js.native
trait MRAID2
  extends StObject
     with MRAID1 {
  
  def createCalendarEvent(parameters: MRAIDCalendarEvent): Unit = js.native
  
  def getCurrentPosition(): MRAIDRect = js.native
  
  def getDefaultPosition(): MRAIDRect = js.native
  
  def getMaxSize(): MRAIDSize = js.native
  
  def getOrientationProperties(): MRAIDOrientationProperties = js.native
  
  def getResizeProperties(): MRAIDExpandProperties = js.native
  
  def getScreenSize(): MRAIDSize = js.native
  
  def resize(): Unit = js.native
  
  // For full compatibility with all SDKs, clients should shallow copy getOrientationProperties result into an empty object, apply changes and then pass into setOrientationProperties
  def setOrientationProperties(newValues: PartialMRAIDOrientationPr): Unit = js.native
  
  // For full compatibility with all SDKs, clients should shallow copy getResizeProperties result into an empty object, apply changes and then pass into setResizeProperties
  def setResizeProperties(newValues: PartialMRAIDExpandPropert): Unit = js.native
  
  def storePicture(url: String): Unit = js.native
  
  def supports(feature: MRAIDFeature): Boolean = js.native
}
