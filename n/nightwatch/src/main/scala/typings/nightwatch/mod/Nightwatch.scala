package typings.nightwatch.mod

import typings.nightwatch.expectMod.Expect
import typings.nightwatch.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nightwatch extends StObject {
  
  var api: NightwatchAPI = js.native
  
  var assert: Assert = js.native
  
  def cli(callback: Any): this.type = js.native
  
  def cliRunner(): this.type = js.native
  def cliRunner(argv: js.Object): this.type = js.native
  
  def client(settings: NightwatchOptions): this.type = js.native
  def client(settings: NightwatchOptions, reporter: Any): this.type = js.native
  def client(settings: NightwatchOptions, reporter: Any, argv: js.Object): this.type = js.native
  def client(settings: NightwatchOptions, reporter: Unit, argv: js.Object): this.type = js.native
  
  def createClient(param0: CreateClientParams): this.type = js.native
  
  var expect: Expect = js.native
  
  def initClient(opts: Any): this.type = js.native
  
  def launchBrowser(): NightwatchAPI | js.Promise[NightwatchAPI] = js.native
  
  def runTests(testSource: String, settings: Any, args: Any*): Any = js.native
  def runTests(testSource: String, settings: Unit, args: Any*): Any = js.native
  def runTests(testSource: js.Array[String], settings: Any, args: Any*): Any = js.native
  def runTests(testSource: js.Array[String], settings: Unit, args: Any*): Any = js.native
  
  def runner(): this.type = js.native
  def runner(argv: js.Object): this.type = js.native
  def runner(argv: js.Object, done: js.Function0[Unit]): this.type = js.native
  def runner(argv: js.Object, done: js.Function0[Unit], settings: js.Object): this.type = js.native
  def runner(argv: js.Object, done: Unit, settings: js.Object): this.type = js.native
  def runner(argv: Unit, done: js.Function0[Unit]): this.type = js.native
  def runner(argv: Unit, done: js.Function0[Unit], settings: js.Object): this.type = js.native
  def runner(argv: Unit, done: Unit, settings: js.Object): this.type = js.native
  
  def updateCapabilities(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): this.type = js.native
  
  var verify: Assert = js.native
}
object Nightwatch {
  
  inline def apply: NightwatchClient & Nightwatch = ^.asInstanceOf[js.Dynamic].selectDynamic("Nightwatch").asInstanceOf[NightwatchClient & Nightwatch]
}
