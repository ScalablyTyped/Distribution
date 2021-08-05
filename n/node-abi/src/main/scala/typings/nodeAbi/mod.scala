package typings.nodeAbi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-abi", "additionalTargets")
  @js.native
  def additionalTargets: js.Array[Target] = js.native
  inline def additionalTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "allTargets")
  @js.native
  def allTargets: js.Array[Target] = js.native
  inline def allTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "deprecatedTargets")
  @js.native
  def deprecatedTargets: js.Array[Target] = js.native
  inline def deprecatedTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "futureTargets")
  @js.native
  def futureTargets: js.Array[Target] = js.native
  inline def futureTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureTargets")(x.asInstanceOf[js.Any])
  
  inline def getAbi(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbi")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getAbi(target: String, runtime: Runtime): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbi")(target.asInstanceOf[js.Any], runtime.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNextTarget(runtime: Runtime): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getNextTarget")(runtime.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getNextTarget(runtime: Runtime, targets: js.Array[Target]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_getNextTarget")(runtime.asInstanceOf[js.Any], targets.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getTarget(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")().asInstanceOf[String]
  inline def getTarget(abi: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(abi.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTarget(abi: String, runtime: Runtime): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(abi.asInstanceOf[js.Any], runtime.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTarget(abi: Unit, runtime: Runtime): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(abi.asInstanceOf[js.Any], runtime.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("node-abi", "supportedTargets")
  @js.native
  def supportedTargets: js.Array[Target] = js.native
  inline def supportedTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTargets")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeAbi.nodeAbiStrings.electron
    - typings.nodeAbi.nodeAbiStrings.node
    - typings.nodeAbi.nodeAbiStrings.`node-webkit`
  */
  trait Runtime extends StObject
  object Runtime {
    
    inline def electron: typings.nodeAbi.nodeAbiStrings.electron = "electron".asInstanceOf[typings.nodeAbi.nodeAbiStrings.electron]
    
    inline def node: typings.nodeAbi.nodeAbiStrings.node = "node".asInstanceOf[typings.nodeAbi.nodeAbiStrings.node]
    
    inline def `node-webkit`: typings.nodeAbi.nodeAbiStrings.`node-webkit` = "node-webkit".asInstanceOf[typings.nodeAbi.nodeAbiStrings.`node-webkit`]
  }
  
  trait Target extends StObject {
    
    var abi: String
    
    var lts: Boolean
    
    var runtime: Runtime
    
    var target: String
  }
  object Target {
    
    inline def apply(abi: String, lts: Boolean, runtime: Runtime, target: String): Target = {
      val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], lts = lts.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setAbi(value: String): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
      
      inline def setLts(value: Boolean): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
