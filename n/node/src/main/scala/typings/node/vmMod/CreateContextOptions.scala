package typings.node.vmMod

import typings.node.anon.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContextOptions extends js.Object {
  var codeGeneration: js.UndefOr[Strings] = js.native
  /**
    * Human-readable name of the newly created context.
    * @default 'VM Context i' Where i is an ascending numerical index of the created context.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Corresponds to the newly created context for display purposes.
    * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
    * like the value of the `url.origin` property of a URL object.
    * Most notably, this string should omit the trailing slash, as that denotes a path.
    * @default ''
    */
  var origin: js.UndefOr[String] = js.native
}

object CreateContextOptions {
  @scala.inline
  def apply(): CreateContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContextOptions]
  }
  @scala.inline
  implicit class CreateContextOptionsOps[Self <: CreateContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeGeneration(value: Strings): Self = this.set("codeGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeGeneration: Self = this.set("codeGeneration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

