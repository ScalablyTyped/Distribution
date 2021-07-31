package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  @JSImport("node-os-utils/lib/os", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Os {
    
    /* CompleteClass */
    override def arch(): String = js.native
    
    /* CompleteClass */
    override def hostname(): String = js.native
    
    /* CompleteClass */
    override def ip(): String = js.native
    
    /* CompleteClass */
    override def oos(): js.Function0[js.Promise[String]] = js.native
    
    /* CompleteClass */
    override def platform(): Platform = js.native
    
    /* CompleteClass */
    override def `type`(): String = js.native
    
    /* CompleteClass */
    override def uptime(): Double = js.native
  }
  
  trait Os extends StObject {
    
    def arch(): String
    
    def hostname(): String
    
    def ip(): String
    
    def oos(): js.Function0[js.Promise[String]]
    
    def platform(): Platform
    
    def `type`(): String
    
    def uptime(): Double
  }
  object Os {
    
    @scala.inline
    def apply(
      arch: () => String,
      hostname: () => String,
      ip: () => String,
      oos: () => js.Function0[js.Promise[String]],
      platform: () => Platform,
      `type`: () => String,
      uptime: () => Double
    ): Os = {
      val __obj = js.Dynamic.literal(arch = js.Any.fromFunction0(arch), hostname = js.Any.fromFunction0(hostname), ip = js.Any.fromFunction0(ip), oos = js.Any.fromFunction0(oos), platform = js.Any.fromFunction0(platform), uptime = js.Any.fromFunction0(uptime))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Os]
    }
    
    @scala.inline
    implicit class OsMutableBuilder[Self <: Os] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: () => String): Self = StObject.set(x, "arch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHostname(value: () => String): Self = StObject.set(x, "hostname", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIp(value: () => String): Self = StObject.set(x, "ip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOos(value: () => js.Function0[js.Promise[String]]): Self = StObject.set(x, "oos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlatform(value: () => Platform): Self = StObject.set(x, "platform", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUptime(value: () => Double): Self = StObject.set(x, "uptime", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeOsUtils.nodeOsUtilsStrings.aix
    - typings.nodeOsUtils.nodeOsUtilsStrings.android
    - typings.nodeOsUtils.nodeOsUtilsStrings.darwin
    - typings.nodeOsUtils.nodeOsUtilsStrings.freebsd
    - typings.nodeOsUtils.nodeOsUtilsStrings.linux
    - typings.nodeOsUtils.nodeOsUtilsStrings.openbsd
    - typings.nodeOsUtils.nodeOsUtilsStrings.sunos
    - typings.nodeOsUtils.nodeOsUtilsStrings.win32
    - typings.nodeOsUtils.nodeOsUtilsStrings.cygwin
  */
  trait Platform extends StObject
  object Platform {
    
    @scala.inline
    def aix: typings.nodeOsUtils.nodeOsUtilsStrings.aix = "aix".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.aix]
    
    @scala.inline
    def android: typings.nodeOsUtils.nodeOsUtilsStrings.android = "android".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.android]
    
    @scala.inline
    def cygwin: typings.nodeOsUtils.nodeOsUtilsStrings.cygwin = "cygwin".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.cygwin]
    
    @scala.inline
    def darwin: typings.nodeOsUtils.nodeOsUtilsStrings.darwin = "darwin".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.darwin]
    
    @scala.inline
    def freebsd: typings.nodeOsUtils.nodeOsUtilsStrings.freebsd = "freebsd".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.freebsd]
    
    @scala.inline
    def linux: typings.nodeOsUtils.nodeOsUtilsStrings.linux = "linux".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.linux]
    
    @scala.inline
    def openbsd: typings.nodeOsUtils.nodeOsUtilsStrings.openbsd = "openbsd".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.openbsd]
    
    @scala.inline
    def sunos: typings.nodeOsUtils.nodeOsUtilsStrings.sunos = "sunos".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.sunos]
    
    @scala.inline
    def win32: typings.nodeOsUtils.nodeOsUtilsStrings.win32 = "win32".asInstanceOf[typings.nodeOsUtils.nodeOsUtilsStrings.win32]
  }
}
