package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud")
@js.native
object CloudNsMembers extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: org.scalablytyped.runtime.Instantiable0[HTTPOptions] = js.native
  def afterDelete(arg1: js.Any): scala.Unit = js.native
  def afterDelete(arg1: js.Any, func: js.Function1[/* request */ AfterDeleteRequest, scala.Unit]): scala.Unit = js.native
  def afterFind(arg1: js.Any): scala.Unit = js.native
  def afterFind(
    arg1: js.Any,
    func: js.Function2[/* request */ AfterFindRequest, /* response */ AfterFindResponse, scala.Unit]
  ): scala.Unit = js.native
  def afterSave(arg1: js.Any): scala.Unit = js.native
  def afterSave(arg1: js.Any, func: js.Function1[/* request */ AfterSaveRequest, scala.Unit]): scala.Unit = js.native
  def beforeDelete(arg1: js.Any): scala.Unit = js.native
  def beforeDelete(
    arg1: js.Any,
    func: js.Function2[/* request */ BeforeDeleteRequest, /* response */ BeforeDeleteResponse, scala.Unit]
  ): scala.Unit = js.native
  def beforeFind(arg1: js.Any): scala.Unit = js.native
  def beforeFind(arg1: js.Any, func: js.Function1[/* request */ BeforeFindRequest, scala.Unit]): scala.Unit = js.native
  def beforeSave(arg1: js.Any): scala.Unit = js.native
  def beforeSave(
    arg1: js.Any,
    func: js.Function2[/* request */ BeforeSaveRequest, /* response */ BeforeSaveResponse, scala.Unit]
  ): scala.Unit = js.native
  def define(name: java.lang.String): scala.Unit = js.native
  def define(
    name: java.lang.String,
    func: js.Function2[/* request */ FunctionRequest, /* response */ FunctionResponse, scala.Unit]
  ): scala.Unit = js.native
  def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = js.native
  def job(name: java.lang.String): HttpResponse = js.native
  def job(
    name: java.lang.String,
    func: js.Function2[/* request */ JobRequest, /* status */ JobStatus, scala.Unit]
  ): HttpResponse = js.native
  def run(name: java.lang.String): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any, options: RunOptions): js.Promise[_] = js.native
  def useMasterKey(): scala.Unit = js.native
}

