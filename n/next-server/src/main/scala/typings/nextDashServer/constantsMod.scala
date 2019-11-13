package typings.nextDashServer

import typings.nextDashServer.nextDashServerStrings.BUILD_ID
import typings.nextDashServer.nextDashServerStrings.`build-manifestDOTjson`
import typings.nextDashServer.nextDashServerStrings.`pages-manifestDOTjson`
import typings.nextDashServer.nextDashServerStrings.`phase-development-server`
import typings.nextDashServer.nextDashServerStrings.`phase-export`
import typings.nextDashServer.nextDashServerStrings.`phase-production-build`
import typings.nextDashServer.nextDashServerStrings.`phase-production-server`
import typings.nextDashServer.nextDashServerStrings.`prerender-manifestDOTjson`
import typings.nextDashServer.nextDashServerStrings.`react-loadable-manifestDOTjson`
import typings.nextDashServer.nextDashServerStrings.nextDOTconfigDOTjs
import typings.nextDashServer.nextDashServerStrings.public
import typings.nextDashServer.nextDashServerStrings.runtime
import typings.nextDashServer.nextDashServerStrings.server
import typings.nextDashServer.nextDashServerStrings.serverless
import typings.nextDashServer.nextDashServerStrings.static
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val BLOCKED_PAGES: js.Array[String] = js.native
  val BUILD_ID_FILE: BUILD_ID = js.native
  val BUILD_MANIFEST: `build-manifestDOTjson` = js.native
  val CLIENT_PUBLIC_FILES_PATH: public = js.native
  val CLIENT_STATIC_FILES_PATH: static = js.native
  val CLIENT_STATIC_FILES_RUNTIME: runtime = js.native
  val CLIENT_STATIC_FILES_RUNTIME_AMP: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_MAIN: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_PATH: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_WEBPACK: String = js.native
  val CONFIG_FILE: nextDOTconfigDOTjs = js.native
  val IS_BUNDLED_PAGE_REGEX: RegExp = js.native
  val PAGES_MANIFEST: `pages-manifestDOTjson` = js.native
  val PHASE_DEVELOPMENT_SERVER: `phase-development-server` = js.native
  val PHASE_EXPORT: `phase-export` = js.native
  val PHASE_PRODUCTION_BUILD: `phase-production-build` = js.native
  val PHASE_PRODUCTION_SERVER: `phase-production-server` = js.native
  val PRERENDER_MANIFEST: `prerender-manifestDOTjson` = js.native
  val REACT_LOADABLE_MANIFEST: `react-loadable-manifestDOTjson` = js.native
  val ROUTE_NAME_REGEX: RegExp = js.native
  val SERVERLESS_DIRECTORY: serverless = js.native
  val SERVERLESS_ROUTE_NAME_REGEX: RegExp = js.native
  val SERVER_DIRECTORY: server = js.native
}

