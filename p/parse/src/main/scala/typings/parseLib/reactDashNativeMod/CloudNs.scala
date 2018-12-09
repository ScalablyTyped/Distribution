package typings
package parseLib.reactDashNativeMod

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
@JSImport("parse/react-native", "Cloud")
@js.native
object CloudNs extends js.Object {
  /**
           * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
           *
           *     import Buffer = require("buffer").Buffer;
           */
  var HTTPOptions: ScalablyTyped.runtime.Instantiable0[parseLib.ParseNs.CloudNs.HTTPOptions] = js.native
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
  
  type ReadPreferenceOption = parseLib.ParseNs.CloudNs.ReadPreferenceOption
}

