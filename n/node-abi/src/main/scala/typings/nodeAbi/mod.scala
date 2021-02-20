package typings.nodeAbi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-abi", "additionalTargets")
  @js.native
  def additionalTargets: js.Array[Target] = js.native
  @scala.inline
  def additionalTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "allTargets")
  @js.native
  def allTargets: js.Array[Target] = js.native
  @scala.inline
  def allTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "deprecatedTargets")
  @js.native
  def deprecatedTargets: js.Array[Target] = js.native
  @scala.inline
  def deprecatedTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "futureTargets")
  @js.native
  def futureTargets: js.Array[Target] = js.native
  @scala.inline
  def futureTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("node-abi", "getAbi")
  @js.native
  def getAbi(target: String): String = js.native
  @JSImport("node-abi", "getAbi")
  @js.native
  def getAbi(target: String, runtime: Runtime): String = js.native
  
  @JSImport("node-abi", "_getNextTarget")
  @js.native
  def getNextTarget(runtime: Runtime): String | Null = js.native
  @JSImport("node-abi", "_getNextTarget")
  @js.native
  def getNextTarget(runtime: Runtime, targets: js.Array[Target]): String | Null = js.native
  
  @JSImport("node-abi", "getTarget")
  @js.native
  def getTarget(): String = js.native
  @JSImport("node-abi", "getTarget")
  @js.native
  def getTarget(abi: js.UndefOr[scala.Nothing], runtime: Runtime): String = js.native
  @JSImport("node-abi", "getTarget")
  @js.native
  def getTarget(abi: String): String = js.native
  @JSImport("node-abi", "getTarget")
  @js.native
  def getTarget(abi: String, runtime: Runtime): String = js.native
  
  @JSImport("node-abi", "supportedTargets")
  @js.native
  def supportedTargets: js.Array[Target] = js.native
  @scala.inline
  def supportedTargets_=(x: js.Array[Target]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTargets")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeAbi.nodeAbiStrings.electron
    - typings.nodeAbi.nodeAbiStrings.node
    - typings.nodeAbi.nodeAbiStrings.`node-webkit`
  */
  trait Runtime extends StObject
  object Runtime {
    
    @scala.inline
    def electron: typings.nodeAbi.nodeAbiStrings.electron = "electron".asInstanceOf[typings.nodeAbi.nodeAbiStrings.electron]
    
    @scala.inline
    def node: typings.nodeAbi.nodeAbiStrings.node = "node".asInstanceOf[typings.nodeAbi.nodeAbiStrings.node]
    
    @scala.inline
    def `node-webkit`: typings.nodeAbi.nodeAbiStrings.`node-webkit` = "node-webkit".asInstanceOf[typings.nodeAbi.nodeAbiStrings.`node-webkit`]
  }
  
  @js.native
  trait Target extends StObject {
    
    var abi: String = js.native
    
    var lts: Boolean = js.native
    
    var runtime: Runtime = js.native
    
    var target: String = js.native
  }
  object Target {
    
    @scala.inline
    def apply(abi: String, lts: Boolean, runtime: Runtime, target: String): Target = {
      val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], lts = lts.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbi(value: String): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLts(value: Boolean): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
