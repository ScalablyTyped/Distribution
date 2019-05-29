package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace Contains functions for calling and declaring
  * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
  * <p><strong><em>
  *   Some functions are only available from Cloud Code.
  * </em></strong></p>
  */
@JSImport("parse", "Cloud")
@js.native
object CloudNs extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: org.scalablytyped.runtime.Instantiable0[parseLib.ParseNs.CloudNs.HTTPOptions] = js.native
  def afterDelete(arg1: js.Any): scala.Unit = js.native
  def afterDelete(
    arg1: js.Any,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.AfterDeleteRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  def afterFind(arg1: js.Any): scala.Unit = js.native
  def afterFind(
    arg1: js.Any,
    func: js.Function1[/* request */ parseLib.ParseNs.CloudNs.AfterFindRequest, js.Promise[_] | _]
  ): scala.Unit = js.native
  def afterSave(arg1: js.Any): scala.Unit = js.native
  def afterSave(
    arg1: js.Any,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.AfterSaveRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeDelete(arg1: js.Any): scala.Unit = js.native
  def beforeDelete(
    arg1: js.Any,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.BeforeDeleteRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeFind(arg1: js.Any): scala.Unit = js.native
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.BeforeFindRequest, 
      (js.Promise[parseLib.ParseNs.Query[parseLib.ParseNs.Object] | scala.Unit]) | parseLib.ParseNs.Query[parseLib.ParseNs.Object] | scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeSave(arg1: js.Any): scala.Unit = js.native
  def beforeSave(
    arg1: js.Any,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.BeforeSaveRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  def define(name: java.lang.String): scala.Unit = js.native
  def define(
    name: java.lang.String,
    func: js.Function1[/* request */ parseLib.ParseNs.CloudNs.FunctionRequest, js.Promise[_] | _]
  ): scala.Unit = js.native
  def httpRequest(options: parseLib.ParseNs.CloudNs.HTTPOptions): js.Promise[parseLib.ParseNs.CloudNs.HttpResponse] = js.native
  def job(name: java.lang.String): parseLib.ParseNs.CloudNs.HttpResponse = js.native
  def job(
    name: java.lang.String,
    func: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.JobRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): parseLib.ParseNs.CloudNs.HttpResponse = js.native
  def run(name: java.lang.String): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def run(name: java.lang.String, data: js.Any, options: parseLib.ParseNs.CloudNs.RunOptions): js.Promise[_] = js.native
  def useMasterKey(): scala.Unit = js.native
  // Read preference describes how MongoDB driver route read operations to the members of a replica set.
  @js.native
  object ReadPreferenceOption extends js.Object {
    /* "NEAREST" */ val Nearest: parseLib.ParseNs.CloudNs.ReadPreferenceOption.Nearest with java.lang.String = js.native
    /* "PRIMARY" */ val Primary: parseLib.ParseNs.CloudNs.ReadPreferenceOption.Primary with java.lang.String = js.native
    /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: parseLib.ParseNs.CloudNs.ReadPreferenceOption.PrimaryPreferred with java.lang.String = js.native
    /* "SECONDARY" */ val Secondary: parseLib.ParseNs.CloudNs.ReadPreferenceOption.Secondary with java.lang.String = js.native
    /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: parseLib.ParseNs.CloudNs.ReadPreferenceOption.SecondaryPreferred with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[parseLib.ParseNs.CloudNs.ReadPreferenceOption with java.lang.String] = js.native
  }
  
}

