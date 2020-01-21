package typings.nextServer

import typings.nextServer.nextServerStrings.BUILD_ID
import typings.nextServer.nextServerStrings.`build-manifestDotjson`
import typings.nextServer.nextServerStrings.`pages-manifestDotjson`
import typings.nextServer.nextServerStrings.`phase-development-server`
import typings.nextServer.nextServerStrings.`phase-export`
import typings.nextServer.nextServerStrings.`phase-production-build`
import typings.nextServer.nextServerStrings.`phase-production-server`
import typings.nextServer.nextServerStrings.`prerender-manifestDotjson`
import typings.nextServer.nextServerStrings.`react-loadable-manifestDotjson`
import typings.nextServer.nextServerStrings.nextDotconfigDotjs
import typings.nextServer.nextServerStrings.public
import typings.nextServer.nextServerStrings.runtime
import typings.nextServer.nextServerStrings.server
import typings.nextServer.nextServerStrings.serverless
import typings.nextServer.nextServerStrings.static
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val BLOCKED_PAGES: js.Array[String] = js.native
  val BUILD_ID_FILE: BUILD_ID = js.native
  val BUILD_MANIFEST: `build-manifestDotjson` = js.native
  val CLIENT_PUBLIC_FILES_PATH: public = js.native
  val CLIENT_STATIC_FILES_PATH: static = js.native
  val CLIENT_STATIC_FILES_RUNTIME: runtime = js.native
  val CLIENT_STATIC_FILES_RUNTIME_AMP: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_MAIN: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_PATH: String = js.native
  val CLIENT_STATIC_FILES_RUNTIME_WEBPACK: String = js.native
  val CONFIG_FILE: nextDotconfigDotjs = js.native
  val IS_BUNDLED_PAGE_REGEX: RegExp = js.native
  val PAGES_MANIFEST: `pages-manifestDotjson` = js.native
  val PHASE_DEVELOPMENT_SERVER: `phase-development-server` = js.native
  val PHASE_EXPORT: `phase-export` = js.native
  val PHASE_PRODUCTION_BUILD: `phase-production-build` = js.native
  val PHASE_PRODUCTION_SERVER: `phase-production-server` = js.native
  val PRERENDER_MANIFEST: `prerender-manifestDotjson` = js.native
  val REACT_LOADABLE_MANIFEST: `react-loadable-manifestDotjson` = js.native
  val ROUTE_NAME_REGEX: RegExp = js.native
  val SERVERLESS_DIRECTORY: serverless = js.native
  val SERVERLESS_ROUTE_NAME_REGEX: RegExp = js.native
  val SERVER_DIRECTORY: server = js.native
}

