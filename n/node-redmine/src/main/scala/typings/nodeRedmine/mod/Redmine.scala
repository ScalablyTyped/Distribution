package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-redmine", "Redmine")
@js.native
class Redmine protected () extends js.Object {
  def this(host: String, config: js.Any, port: Double) = this()
  def add_watcher(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def create_issue(issue: IssueData, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
  def create_issue_relation(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def delete_issue(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def delete_issue_relation(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def get_issue_by_id(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
  def issue_relation_by_id(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  /////////////////////////////////////// REST API for Issue Relations(Alpha) ///////////////////////////////////////
  def issue_relation_by_issue_id(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  /////////////////////////////////////// REST API for issues(Stable) ///////////////////////////////////////
  def issues(params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issues = js.native
  def remove_watcher(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def update_issue(id: Double, issue: IssueData, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
  /////////////////////////////////////// REST API for Common(Alpha) ///////////////////////////////////////
  def upload(content: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): UploadResult = js.native
}

