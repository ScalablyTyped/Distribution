package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.DataView
import typings.powerbiVisualsTools.mod.extensibility.^
import typings.std.ClassDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VisualPlugin(options: IVisualPluginOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VisualPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]

type IVisualDataViewTransform = js.Function1[/* dataview */ js.Array[DataView], Any]
