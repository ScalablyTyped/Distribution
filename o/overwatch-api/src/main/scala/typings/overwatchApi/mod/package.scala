package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getProfile(
  platform: typings.overwatchApi.mod.PLATFORM,
  region: typings.overwatchApi.mod.REGION,
  tag: java.lang.String,
  callback: js.Function2[/* err */ typings.std.Error, /* data */ typings.overwatchApi.mod.Profile, scala.Unit]
): scala.Unit = (typings.overwatchApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def getStats(
  platform: typings.overwatchApi.mod.PLATFORM,
  region: typings.overwatchApi.mod.REGION,
  tag: java.lang.String,
  callback: js.Function2[/* err */ typings.std.Error, /* data */ typings.overwatchApi.mod.Stats, scala.Unit]
): scala.Unit = (typings.overwatchApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getStats")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
