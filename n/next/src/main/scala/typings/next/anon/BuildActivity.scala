package typings.next.anon

import typings.next.nextStrings.`bottom-left`
import typings.next.nextStrings.`bottom-right`
import typings.next.nextStrings.`top-left`
import typings.next.nextStrings.`top-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildActivity extends StObject {
  
  /** Show "building..."" indicator in development */
  var buildActivity: js.UndefOr[Boolean] = js.undefined
  
  /** Position of "building..." indicator in browser */
  var buildActivityPosition: js.UndefOr[`bottom-right` | `bottom-left` | `top-right` | `top-left`] = js.undefined
}
object BuildActivity {
  
  inline def apply(): BuildActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildActivity]
  }
  
  extension [Self <: BuildActivity](x: Self) {
    
    inline def setBuildActivity(value: Boolean): Self = StObject.set(x, "buildActivity", value.asInstanceOf[js.Any])
    
    inline def setBuildActivityPosition(value: `bottom-right` | `bottom-left` | `top-right` | `top-left`): Self = StObject.set(x, "buildActivityPosition", value.asInstanceOf[js.Any])
    
    inline def setBuildActivityPositionUndefined: Self = StObject.set(x, "buildActivityPosition", js.undefined)
    
    inline def setBuildActivityUndefined: Self = StObject.set(x, "buildActivity", js.undefined)
  }
}
