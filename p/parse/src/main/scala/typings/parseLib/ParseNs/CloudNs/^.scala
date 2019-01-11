package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud")
@js.native
object ^ extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: org.scalablytyped.runtime.Instantiable0[parseLib.ParseNs.CloudNs.HTTPOptions] = js.native
  def afterDelete(arg1: js.Any): scala.Unit = js.native
  def afterDelete(
    arg1: js.Any,
    func: js.Function1[/* request */ parseLib.ParseNs.CloudNs.AfterDeleteRequest, scala.Unit]
  ): scala.Unit = js.native
  def afterFind(arg1: js.Any): scala.Unit = js.native
  def afterFind(
    arg1: js.Any,
    func: js.Function2[
      /* request */ parseLib.ParseNs.CloudNs.AfterFindRequest, 
      /* response */ parseLib.ParseNs.CloudNs.AfterFindResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterSave(arg1: js.Any): scala.Unit = js.native
  def afterSave(
    arg1: js.Any,
    func: js.Function1[/* request */ parseLib.ParseNs.CloudNs.AfterSaveRequest, scala.Unit]
  ): scala.Unit = js.native
  def beforeDelete(arg1: js.Any): scala.Unit = js.native
  def beforeDelete(
    arg1: js.Any,
    func: js.Function2[
      /* request */ parseLib.ParseNs.CloudNs.BeforeDeleteRequest, 
      /* response */ parseLib.ParseNs.CloudNs.BeforeDeleteResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeFind(arg1: js.Any): scala.Unit = js.native
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[/* request */ parseLib.ParseNs.CloudNs.BeforeFindRequest, scala.Unit]
  ): scala.Unit = js.native
  def beforeSave(arg1: js.Any): scala.Unit = js.native
  def beforeSave(
    arg1: js.Any,
    func: js.Function2[
      /* request */ parseLib.ParseNs.CloudNs.BeforeSaveRequest, 
      /* response */ parseLib.ParseNs.CloudNs.BeforeSaveResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def define(name: java.lang.String): scala.Unit = js.native
  def define(
    name: java.lang.String,
    func: js.Function2[
      /* request */ parseLib.ParseNs.CloudNs.FunctionRequest, 
      /* response */ parseLib.ParseNs.CloudNs.FunctionResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def httpRequest(options: parseLib.ParseNs.CloudNs.HTTPOptions): js.Promise[parseLib.ParseNs.CloudNs.HttpResponse] = js.native
  def job(name: java.lang.String): parseLib.ParseNs.CloudNs.HttpResponse = js.native
  def job(
    name: java.lang.String,
    func: js.Function2[
      /* request */ parseLib.ParseNs.CloudNs.JobRequest, 
      /* status */ parseLib.ParseNs.CloudNs.JobStatus, 
      scala.Unit
    ]
  ): parseLib.ParseNs.CloudNs.HttpResponse = js.native
  def run(name: java.lang.String): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any, options: parseLib.ParseNs.CloudNs.RunOptions): js.Promise[_] = js.native
  def useMasterKey(): scala.Unit = js.native
}

