package typings
package needleLib.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", JSImport.Namespace)
@js.native
object needleModMembers extends js.Object {
  /**
   * Calling needle() directly returns a Promise.
   *
   * Since needle 2.0
   * @param method Designates an HTTP verb for the request.
   * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
   */
  def apply(
    method: needleLib.needleMod.coreNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.coreNs.BodyData
  ): js.Promise[needleLib.needleMod.coreNs.NeedleResponse] = js.native
  /**
   * Calling needle() directly returns a Promise.
   *
   * Since needle 2.0
   * @param method Designates an HTTP verb for the request.
   * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
   */
  def apply(
    method: needleLib.needleMod.coreNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.coreNs.BodyData,
    options: needleLib.needleMod.coreNs.NeedleOptions
  ): js.Promise[needleLib.needleMod.coreNs.NeedleResponse] = js.native
  /**
   * Calling needle() directly returns a Promise.
   *
   * Since needle 2.0
   * @param method Designates an HTTP verb for the request.
   */
  def apply(method: needleLib.needleMod.coreNs.NeedleReadonlyHttpVerbs, url: java.lang.String): js.Promise[needleLib.needleMod.coreNs.NeedleResponse] = js.native
  /**
   * Calling needle() directly returns a Promise.
   *
   * Since needle 2.0
   * @param method Designates an HTTP verb for the request.
   */
  def apply(
    method: needleLib.needleMod.coreNs.NeedleReadonlyHttpVerbs,
    url: java.lang.String,
    options: needleLib.needleMod.coreNs.NeedleOptions
  ): js.Promise[needleLib.needleMod.coreNs.NeedleResponse] = js.native
  def defaults(options: needleLib.needleMod.needleNs.NeedleOptions): needleLib.needleMod.needleNs.NeedleOptions = js.native
  /**
       * Issues an HTTP DELETE request.
       */
  def deleteFunc(url: java.lang.String, data: needleLib.needleMod.needleNs.BodyData): needleLib.needleMod.needleNs.ReadableStream = js.native
  /**
       * Issues an HTTP DELETE request.
       */
  def deleteFunc(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  /**
       * Issues an HTTP DELETE request.
       */
  def deleteFunc(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  /**
       * Issues an HTTP DELETE request.
       */
  def deleteFunc(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def get(url: java.lang.String): needleLib.needleMod.needleNs.ReadableStream = js.native
  def get(url: java.lang.String, callback: needleLib.needleMod.needleNs.NeedleCallback): needleLib.needleMod.needleNs.ReadableStream = js.native
  def get(url: java.lang.String, options: needleLib.needleMod.needleNs.NeedleOptions): needleLib.needleMod.needleNs.ReadableStream = js.native
  def get(
    url: java.lang.String,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def head(url: java.lang.String): needleLib.needleMod.needleNs.ReadableStream = js.native
  def head(url: java.lang.String, callback: needleLib.needleMod.needleNs.NeedleCallback): needleLib.needleMod.needleNs.ReadableStream = js.native
  def head(url: java.lang.String, options: needleLib.needleMod.needleNs.NeedleOptions): needleLib.needleMod.needleNs.ReadableStream = js.native
  def head(
    url: java.lang.String,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def patch(url: java.lang.String, data: needleLib.needleMod.needleNs.BodyData): needleLib.needleMod.needleNs.ReadableStream = js.native
  def patch(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def patch(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def patch(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def post(url: java.lang.String, data: needleLib.needleMod.needleNs.BodyData): needleLib.needleMod.needleNs.ReadableStream = js.native
  def post(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def post(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def post(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def put(url: java.lang.String, data: needleLib.needleMod.needleNs.BodyData): needleLib.needleMod.needleNs.ReadableStream = js.native
  def put(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def put(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def put(
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def request(
    method: needleLib.needleMod.needleNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def request(
    method: needleLib.needleMod.needleNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def request(
    method: needleLib.needleMod.needleNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
  def request(
    method: needleLib.needleMod.needleNs.NeedleHttpVerbs,
    url: java.lang.String,
    data: needleLib.needleMod.needleNs.BodyData,
    options: needleLib.needleMod.needleNs.NeedleOptions,
    callback: needleLib.needleMod.needleNs.NeedleCallback
  ): needleLib.needleMod.needleNs.ReadableStream = js.native
}

