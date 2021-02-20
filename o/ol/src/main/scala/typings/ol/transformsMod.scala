package typings.ol

import typings.ol.projMod.TransformFunction
import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("ol/proj/transforms", "add")
  @js.native
  def add(source: default, destination: default, transformFn: TransformFunction): Unit = js.native
  
  @JSImport("ol/proj/transforms", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("ol/proj/transforms", "get")
  @js.native
  def get(sourceCode: String, destinationCode: String): js.UndefOr[TransformFunction] = js.native
  
  @JSImport("ol/proj/transforms", "remove")
  @js.native
  def remove(source: default, destination: default): TransformFunction = js.native
}
