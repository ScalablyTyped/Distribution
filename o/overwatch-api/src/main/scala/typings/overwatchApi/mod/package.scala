package typings.overwatchApi.mod

import typings.overwatchApi.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getProfile(
  platform: PLATFORM,
  region: REGION,
  tag: String,
  callback: js.Function2[/* err */ js.Error, /* data */ Profile, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getStats(
  platform: PLATFORM,
  region: REGION,
  tag: String,
  callback: js.Function2[/* err */ js.Error, /* data */ Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getStats")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
