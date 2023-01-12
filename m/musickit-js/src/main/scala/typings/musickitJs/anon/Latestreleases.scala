package typings.musickitJs.anon

import typings.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latestreleases extends StObject {
  
  var `latest-releases`: View[typings.musickitJs.MusicKit.Albums]
  
  var `top-releases`: View[typings.musickitJs.MusicKit.Albums]
}
object Latestreleases {
  
  inline def apply(
    `latest-releases`: View[typings.musickitJs.MusicKit.Albums],
    `top-releases`: View[typings.musickitJs.MusicKit.Albums]
  ): Latestreleases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latest-releases")(`latest-releases`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-releases")(`top-releases`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latestreleases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Latestreleases] (val x: Self) extends AnyVal {
    
    inline def `setLatest-releases`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "latest-releases", value.asInstanceOf[js.Any])
    
    inline def `setTop-releases`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "top-releases", value.asInstanceOf[js.Any])
  }
}
