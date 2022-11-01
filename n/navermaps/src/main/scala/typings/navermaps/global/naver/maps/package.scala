package typings.navermaps.global.naver.maps

import typings.navermaps.global.naver.maps.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/***** static members *****/
inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]
inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])

inline def jsContentLoaded: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("jsContentLoaded").asInstanceOf[Boolean]
inline def jsContentLoaded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsContentLoaded")(x.asInstanceOf[js.Any])

inline def onJsContentLoaded(
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onJsContentLoaded")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
