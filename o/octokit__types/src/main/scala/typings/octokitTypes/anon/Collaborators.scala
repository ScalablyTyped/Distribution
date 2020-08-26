package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collaborators extends js.Object {
  var collaborators: Double = js.native
  var name: String = js.native
  var private_repos: Double = js.native
  var space: Double = js.native
}

object Collaborators {
  @scala.inline
  def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Collaborators = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaborators]
  }
  @scala.inline
  implicit class CollaboratorsOps[Self <: Collaborators] (val x: Self) extends AnyVal {
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
    def setCollaborators(value: Double): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate_repos(value: Double): Self = this.set("private_repos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
  }
  
}

