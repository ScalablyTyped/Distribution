package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "PulsingBeaconAnimationStyles")
@js.native
object PulsingBeaconAnimationStyles extends js.Object {
  
  var continuousPulseAnimationDouble: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  
  var continuousPulseAnimationSingle: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  
  var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
}
