package typings.ol

import typings.ol.projMod.TransformFunction
import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("ol/proj/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(source: default, destination: default, transformFn: TransformFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], transformFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @scala.inline
  def get(sourceCode: String, destinationCode: String): js.UndefOr[TransformFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(sourceCode.asInstanceOf[js.Any], destinationCode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TransformFunction]]
  
  @scala.inline
  def remove(source: default, destination: default): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
}
