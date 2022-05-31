package typings.overwatchApi

import typings.overwatchApi.mod.PLATFORM
import typings.overwatchApi.mod.Profile
import typings.overwatchApi.mod.REGION
import typings.overwatchApi.mod.Stats
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OverwatchAPI {
    
    @JSGlobal("OverwatchAPI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getProfile(
      platform: PLATFORM,
      region: REGION,
      tag: String,
      callback: js.Function2[/* err */ Error, /* data */ Profile, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getStats(
      platform: PLATFORM,
      region: REGION,
      tag: String,
      callback: js.Function2[/* err */ Error, /* data */ Stats, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getStats")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
