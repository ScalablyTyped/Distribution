package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mraid.mod.MRAID because Already inherited */ @js.native
trait MRAID3
  extends StObject
     with MRAID2 {
  
  def getCurrentAppOrientation(): MRAIDAppOrientationState = js.native
  
  def getLocation(): js.UndefOr[MRAIDLocationState] = js.native
  
  def unload(): Unit = js.native
}
