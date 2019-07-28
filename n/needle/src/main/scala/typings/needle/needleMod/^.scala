package typings.needle.needleMod

import typings.needle.needleMod.coreNs.NeedleReadonlyHttpVerbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
    */
  def apply(
    method: typings.needle.needleMod.coreNs.NeedleHttpVerbs,
    url: String,
    data: typings.needle.needleMod.coreNs.BodyData
  ): js.Promise[typings.needle.needleMod.coreNs.NeedleResponse] = js.native
  def apply(
    method: typings.needle.needleMod.coreNs.NeedleHttpVerbs,
    url: String,
    data: typings.needle.needleMod.coreNs.BodyData,
    options: typings.needle.needleMod.coreNs.NeedleOptions
  ): js.Promise[typings.needle.needleMod.coreNs.NeedleResponse] = js.native
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typings.needle.needleMod.coreNs.NeedleResponse] = js.native
  def apply(
    method: NeedleReadonlyHttpVerbs,
    url: String,
    options: typings.needle.needleMod.coreNs.NeedleOptions
  ): js.Promise[typings.needle.needleMod.coreNs.NeedleResponse] = js.native
  def defaults(options: NeedleOptions): NeedleOptions = js.native
  /**
    * Issues an HTTP DELETE request.
    */
  def delete(url: String, data: BodyData): ReadableStream = js.native
  def delete(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def delete(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def delete(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  /**
    * Issues an HTTP DELETE request.
    */
  def deleteFunc(url: String, data: BodyData): ReadableStream = js.native
  def deleteFunc(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def deleteFunc(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def deleteFunc(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def get(url: String): ReadableStream = js.native
  def get(url: String, callback: NeedleCallback): ReadableStream = js.native
  def get(url: String, options: NeedleOptions): ReadableStream = js.native
  def get(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def head(url: String): ReadableStream = js.native
  def head(url: String, callback: NeedleCallback): ReadableStream = js.native
  def head(url: String, options: NeedleOptions): ReadableStream = js.native
  def head(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def patch(url: String, data: BodyData): ReadableStream = js.native
  def patch(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def patch(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def patch(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def post(url: String, data: BodyData): ReadableStream = js.native
  def post(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def post(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def post(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def put(url: String, data: BodyData): ReadableStream = js.native
  def put(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def put(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def put(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData): ReadableStream = js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def request(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: NeedleOptions,
    callback: NeedleCallback
  ): ReadableStream = js.native
}

