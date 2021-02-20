package typings.nextEnv

import org.scalablytyped.runtime.StringDictionary
import typings.nextEnv.anon.CombinedEnv
import typings.nextEnv.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@next/env", "loadEnvConfig")
  @js.native
  def loadEnvConfig(dir: String): CombinedEnv = js.native
  @JSImport("@next/env", "loadEnvConfig")
  @js.native
  def loadEnvConfig(dir: String, dev: js.UndefOr[scala.Nothing], log: Log): CombinedEnv = js.native
  @JSImport("@next/env", "loadEnvConfig")
  @js.native
  def loadEnvConfig(dir: String, dev: Boolean): CombinedEnv = js.native
  @JSImport("@next/env", "loadEnvConfig")
  @js.native
  def loadEnvConfig(dir: String, dev: Boolean, log: Log): CombinedEnv = js.native
  
  @JSImport("@next/env", "processEnv")
  @js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles): Env = js.native
  @JSImport("@next/env", "processEnv")
  @js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: js.UndefOr[scala.Nothing], log: Log): Env = js.native
  @JSImport("@next/env", "processEnv")
  @js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String): Env = js.native
  @JSImport("@next/env", "processEnv")
  @js.native
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Log): Env = js.native
  
  type Env = StringDictionary[String]
  
  type LoadedEnvFiles = js.Array[Contents]
  
  @js.native
  trait Log extends StObject {
    
    def error(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
  }
  object Log {
    
    @scala.inline
    def apply(error: /* repeated */ js.Any => Unit, info: /* repeated */ js.Any => Unit): Log = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info))
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    }
  }
}
