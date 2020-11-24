package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTargetsForShard extends js.Object {
  
  /**
    * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package
    * com.my.packages" "class com.my.package.MyClass". The number of shard_test_targets must be greater than 0.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}
object TestTargetsForShard {
  
  @scala.inline
  def apply(): TestTargetsForShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTargetsForShard]
  }
  
  @scala.inline
  implicit class TestTargetsForShardOps[Self <: TestTargetsForShard] (val x: Self) extends AnyVal {
    
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
    def setTestTargetsVarargs(value: String*): Self = this.set("testTargets", js.Array(value :_*))
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = this.set("testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTargets: Self = this.set("testTargets", js.undefined)
  }
}
