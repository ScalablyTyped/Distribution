package typings.mockery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockery", "deregisterAll")
  @js.native
  def deregisterAll(): Unit = js.native
  
  @JSImport("mockery", "deregisterAllowable")
  @js.native
  def deregisterAllowable(name: String): Unit = js.native
  
  @JSImport("mockery", "deregisterAllowables")
  @js.native
  def deregisterAllowables(names: js.Array[String]): Unit = js.native
  
  @JSImport("mockery", "deregisterMock")
  @js.native
  def deregisterMock(name: String): Unit = js.native
  
  @JSImport("mockery", "deregisterSubstitute")
  @js.native
  def deregisterSubstitute(name: String): Unit = js.native
  
  @JSImport("mockery", "disable")
  @js.native
  def disable(): Unit = js.native
  
  @JSImport("mockery", "enable")
  @js.native
  def enable(): Unit = js.native
  @JSImport("mockery", "enable")
  @js.native
  def enable(args: MockeryEnableArgs): Unit = js.native
  
  @JSImport("mockery", "registerAllowable")
  @js.native
  def registerAllowable(name: String): Unit = js.native
  @JSImport("mockery", "registerAllowable")
  @js.native
  def registerAllowable(name: String, unhook: Boolean): Unit = js.native
  
  @JSImport("mockery", "registerAllowables")
  @js.native
  def registerAllowables(names: js.Array[String]): Unit = js.native
  
  @JSImport("mockery", "registerMock")
  @js.native
  def registerMock(name: String, mock: js.Any): Unit = js.native
  
  @JSImport("mockery", "registerSubstitute")
  @js.native
  def registerSubstitute(name: String, substitute: String): Unit = js.native
  
  @JSImport("mockery", "resetCache")
  @js.native
  def resetCache(): Unit = js.native
  
  @JSImport("mockery", "warnOnReplace")
  @js.native
  def warnOnReplace(value: Boolean): Unit = js.native
  
  @JSImport("mockery", "warnOnUnregistered")
  @js.native
  def warnOnUnregistered(value: Boolean): Unit = js.native
  
  @js.native
  trait MockeryEnableArgs extends StObject {
    
    var useCleanCache: js.UndefOr[Boolean] = js.native
    
    var warnOnReplace: js.UndefOr[Boolean] = js.native
    
    var warnOnUnregistered: js.UndefOr[Boolean] = js.native
  }
  object MockeryEnableArgs {
    
    @scala.inline
    def apply(): MockeryEnableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockeryEnableArgs]
    }
    
    @scala.inline
    implicit class MockeryEnableArgsMutableBuilder[Self <: MockeryEnableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseCleanCache(value: Boolean): Self = StObject.set(x, "useCleanCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCleanCacheUndefined: Self = StObject.set(x, "useCleanCache", js.undefined)
      
      @scala.inline
      def setWarnOnReplace(value: Boolean): Self = StObject.set(x, "warnOnReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnOnReplaceUndefined: Self = StObject.set(x, "warnOnReplace", js.undefined)
      
      @scala.inline
      def setWarnOnUnregistered(value: Boolean): Self = StObject.set(x, "warnOnUnregistered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnOnUnregisteredUndefined: Self = StObject.set(x, "warnOnUnregistered", js.undefined)
    }
  }
}
