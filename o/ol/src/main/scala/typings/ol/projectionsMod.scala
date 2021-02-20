package typings.ol

import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionsMod {
  
  @JSImport("ol/proj/projections", "add")
  @js.native
  def add(code: String, projection: default): Unit = js.native
  
  @JSImport("ol/proj/projections", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("ol/proj/projections", "get")
  @js.native
  def get(code: String): default = js.native
}
