package typings.ngPackagr.anon

import org.scalablytyped.runtime.Instantiable1
import typings.angularCompilerCli.loggerMod.LogLevel
import typings.angularCompilerCli.ngccOptionsMod.AsyncNgccOptions
import typings.angularCompilerCli.ngccOptionsMod.SyncNgccOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedNgcc extends StObject {
  
  var ConsoleLogger: Instantiable1[/* level */ LogLevel, typings.angularCompilerCli.ngccMod.ConsoleLogger] = js.native
  
  def clearTsConfigCache(): Unit = js.native
  
  val containingDirPath: String = js.native
  
  val ngccMainFilePath: String = js.native
  
  def process(options: AsyncNgccOptions): Unit | js.Promise[Unit] = js.native
  def process(options: SyncNgccOptions): Unit | js.Promise[Unit] = js.native
}
