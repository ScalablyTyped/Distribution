package typings.neverbounce.neverbounceMod

import typings.neverbounce.Anon_0
import typings.neverbounce.Anon_InputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neverbounce", JSImport.Namespace)
@js.native
class ^ protected () extends NeverBounce {
  def this(config: Config) = this()
  /* CompleteClass */
  override var account: Account = js.native
  /* CompleteClass */
  override var errors: Errors = js.native
  /* CompleteClass */
  override var jobs: Jobs = js.native
  /* CompleteClass */
  override var poe: Poe = js.native
  /* CompleteClass */
  override var single: Single = js.native
  /* CompleteClass */
  override def getConfig(): Config = js.native
  /* CompleteClass */
  override def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
  /* CompleteClass */
  override def setApiKey(key: String): Unit = js.native
  /* CompleteClass */
  override def setHost(host: String): Unit = js.native
}

@JSImport("neverbounce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultConfig: Config = js.native
  var job: Anon_InputType = js.native
  var result: Anon_0 = js.native
}

