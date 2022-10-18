package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOscmdMod {
  
  @JSImport("node-os-utils/lib/oscmd", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OsCmd {
    
    /* CompleteClass */
    override def diskUsage(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def ifconfig(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def openPorts(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def processesUsers(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def topCpu(): js.Function0[js.Promise[String]] = js.native
    
    /* CompleteClass */
    override def topMem(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def vmstats(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def who(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def whoami(): js.Promise[String] = js.native
  }
  
  trait OsCmd extends StObject {
    
    def diskUsage(): js.Promise[String]
    
    def ifconfig(): js.Promise[String]
    
    def openPorts(): js.Promise[String]
    
    def processesUsers(): js.Promise[String]
    
    def topCpu(): js.Function0[js.Promise[String]]
    
    def topMem(): js.Promise[String]
    
    def vmstats(): js.Promise[String]
    
    def who(): js.Promise[String]
    
    def whoami(): js.Promise[String]
  }
  object OsCmd {
    
    inline def apply(
      diskUsage: () => js.Promise[String],
      ifconfig: () => js.Promise[String],
      openPorts: () => js.Promise[String],
      processesUsers: () => js.Promise[String],
      topCpu: () => js.Function0[js.Promise[String]],
      topMem: () => js.Promise[String],
      vmstats: () => js.Promise[String],
      who: () => js.Promise[String],
      whoami: () => js.Promise[String]
    ): OsCmd = {
      val __obj = js.Dynamic.literal(diskUsage = js.Any.fromFunction0(diskUsage), ifconfig = js.Any.fromFunction0(ifconfig), openPorts = js.Any.fromFunction0(openPorts), processesUsers = js.Any.fromFunction0(processesUsers), topCpu = js.Any.fromFunction0(topCpu), topMem = js.Any.fromFunction0(topMem), vmstats = js.Any.fromFunction0(vmstats), who = js.Any.fromFunction0(who), whoami = js.Any.fromFunction0(whoami))
      __obj.asInstanceOf[OsCmd]
    }
    
    extension [Self <: OsCmd](x: Self) {
      
      inline def setDiskUsage(value: () => js.Promise[String]): Self = StObject.set(x, "diskUsage", js.Any.fromFunction0(value))
      
      inline def setIfconfig(value: () => js.Promise[String]): Self = StObject.set(x, "ifconfig", js.Any.fromFunction0(value))
      
      inline def setOpenPorts(value: () => js.Promise[String]): Self = StObject.set(x, "openPorts", js.Any.fromFunction0(value))
      
      inline def setProcessesUsers(value: () => js.Promise[String]): Self = StObject.set(x, "processesUsers", js.Any.fromFunction0(value))
      
      inline def setTopCpu(value: () => js.Function0[js.Promise[String]]): Self = StObject.set(x, "topCpu", js.Any.fromFunction0(value))
      
      inline def setTopMem(value: () => js.Promise[String]): Self = StObject.set(x, "topMem", js.Any.fromFunction0(value))
      
      inline def setVmstats(value: () => js.Promise[String]): Self = StObject.set(x, "vmstats", js.Any.fromFunction0(value))
      
      inline def setWho(value: () => js.Promise[String]): Self = StObject.set(x, "who", js.Any.fromFunction0(value))
      
      inline def setWhoami(value: () => js.Promise[String]): Self = StObject.set(x, "whoami", js.Any.fromFunction0(value))
    }
  }
}
