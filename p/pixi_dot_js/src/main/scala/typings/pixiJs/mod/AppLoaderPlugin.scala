package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Application plugin for supporting loader option. Installing the LoaderPlugin
  * is not necessary if using **pixi.js** or **pixi.js-legacy**.
  * @example
  * import {AppLoaderPlugin} from '@pixi/loaders';
  * import {Application} from '@pixi/app';
  * Application.registerPlugin(AppLoaderPlugin);
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "AppLoaderPlugin")
@js.native
class AppLoaderPlugin ()
  extends typings.pixiJs.PIXI.AppLoaderPlugin
