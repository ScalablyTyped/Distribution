package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.anon.BundleBehavior
  - typings.parcelTypes.anon.Env
*/
trait CreateBundleOpts extends StObject
object CreateBundleOpts {
  
  inline def BundleBehavior(entryAsset: Asset, target: Target): typings.parcelTypes.anon.BundleBehavior = {
    val __obj = js.Dynamic.literal(entryAsset = entryAsset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parcelTypes.anon.BundleBehavior]
  }
  
  inline def Env(env: Environment, target: Target, `type`: String, uniqueKey: String): typings.parcelTypes.anon.Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parcelTypes.anon.Env]
  }
}
