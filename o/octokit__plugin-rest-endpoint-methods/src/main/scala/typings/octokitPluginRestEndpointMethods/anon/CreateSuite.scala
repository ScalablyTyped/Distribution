package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSuite extends js.Object {
  var create: `654` = js.native
  var createSuite: `655` = js.native
  var get: `656` = js.native
  var getSuite: `657` = js.native
  var listAnnotations: `658` = js.native
  var listForRef: `659` = js.native
  var listForSuite: `660` = js.native
  var listSuitesForRef: `661` = js.native
  var rerequestSuite: `662` = js.native
  var setSuitesPreferences: `663` = js.native
  var update: `664` = js.native
}

object CreateSuite {
  @scala.inline
  def apply(
    create: `654`,
    createSuite: `655`,
    get: `656`,
    getSuite: `657`,
    listAnnotations: `658`,
    listForRef: `659`,
    listForSuite: `660`,
    listSuitesForRef: `661`,
    rerequestSuite: `662`,
    setSuitesPreferences: `663`,
    update: `664`
  ): CreateSuite = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], createSuite = createSuite.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getSuite = getSuite.asInstanceOf[js.Any], listAnnotations = listAnnotations.asInstanceOf[js.Any], listForRef = listForRef.asInstanceOf[js.Any], listForSuite = listForSuite.asInstanceOf[js.Any], listSuitesForRef = listSuitesForRef.asInstanceOf[js.Any], rerequestSuite = rerequestSuite.asInstanceOf[js.Any], setSuitesPreferences = setSuitesPreferences.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSuite]
  }
  @scala.inline
  implicit class CreateSuiteOps[Self <: CreateSuite] (val x: Self) extends AnyVal {
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
    def setCreate(value: `654`): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateSuite(value: `655`): Self = this.set("createSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `656`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSuite(value: `657`): Self = this.set("getSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setListAnnotations(value: `658`): Self = this.set("listAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForRef(value: `659`): Self = this.set("listForRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForSuite(value: `660`): Self = this.set("listForSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setListSuitesForRef(value: `661`): Self = this.set("listSuitesForRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setRerequestSuite(value: `662`): Self = this.set("rerequestSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSuitesPreferences(value: `663`): Self = this.set("setSuitesPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `664`): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}

