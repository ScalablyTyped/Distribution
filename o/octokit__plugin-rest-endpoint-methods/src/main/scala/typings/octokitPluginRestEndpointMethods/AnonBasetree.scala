package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBasetree extends js.Object {
  var base_tree: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var tree: AnonRequired
  @JSName("tree[].content")
  var `tree[]Dotcontent`: AnonType
  @JSName("tree[].mode")
  var `tree[]Dotmode`: AnonEnum
  @JSName("tree[].path")
  var `tree[]Dotpath`: AnonType
  @JSName("tree[].sha")
  var `tree[]Dotsha`: AnonAllowNull
  @JSName("tree[].type")
  var `tree[]Dottype`: AnonEnum
}

object AnonBasetree {
  @scala.inline
  def apply(
    base_tree: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    tree: AnonRequired,
    `tree[]Dotcontent`: AnonType,
    `tree[]Dotmode`: AnonEnum,
    `tree[]Dotpath`: AnonType,
    `tree[]Dotsha`: AnonAllowNull,
    `tree[]Dottype`: AnonEnum
  ): AnonBasetree = {
    val __obj = js.Dynamic.literal(base_tree = base_tree.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].content")(`tree[]Dotcontent`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].mode")(`tree[]Dotmode`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].path")(`tree[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].sha")(`tree[]Dotsha`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].type")(`tree[]Dottype`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasetree]
  }
}

