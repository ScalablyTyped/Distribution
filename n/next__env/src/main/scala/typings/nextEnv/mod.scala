package typings.nextEnv

import org.scalablytyped.runtime.StringDictionary
import typings.nextEnv.anon.CombinedEnv
import typings.nextEnv.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@next/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadEnvConfig(dir: String): CombinedEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any]).asInstanceOf[CombinedEnv]
  @scala.inline
  def loadEnvConfig(dir: String, dev: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  @scala.inline
  def loadEnvConfig(dir: String, dev: Boolean, log: Log): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  @scala.inline
  def loadEnvConfig(dir: String, dev: Unit, log: Log): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  
  @scala.inline
  def processEnv(loadedEnvFiles: LoadedEnvFiles): Env = ^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any]).asInstanceOf[Env]
  @scala.inline
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Env]
  @scala.inline
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Log): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Env]
  @scala.inline
  def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: Unit, log: Log): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Env]
  
  type Env = StringDictionary[String]
  
  type LoadedEnvFiles = js.Array[Contents]
  
  trait Log extends StObject {
    
    def error(args: js.Any*): Unit
    
    def info(args: js.Any*): Unit
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
