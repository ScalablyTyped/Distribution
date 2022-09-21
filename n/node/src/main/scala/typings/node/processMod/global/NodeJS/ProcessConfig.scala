package typings.node.processMod.global.NodeJS

import typings.node.anon.Cflags
import typings.node.anon.Clang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessConfig extends StObject {
  
  val target_defaults: Cflags
  
  val variables: Clang
}
object ProcessConfig {
  
  inline def apply(target_defaults: Cflags, variables: Clang): ProcessConfig = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessConfig]
  }
  
  extension [Self <: ProcessConfig](x: Self) {
    
    inline def setTarget_defaults(value: Cflags): Self = StObject.set(x, "target_defaults", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Clang): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
