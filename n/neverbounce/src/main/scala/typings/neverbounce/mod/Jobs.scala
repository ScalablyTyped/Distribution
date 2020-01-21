package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs extends js.Object {
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any): js.Promise[Response] = js.native
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any): js.Promise[Response] = js.native
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any, autoParse: js.Any): js.Promise[Response] = js.native
  def create(
    input: js.Any,
    inputLocation: js.Any,
    fileName: js.Any,
    runSample: js.Any,
    autoParse: js.Any,
    autoStart: js.Any
  ): js.Promise[Response] = js.native
  def download(jobId: Double): js.Promise[Response] = js.native
  def parse(jobId: Double): js.Promise[Response] = js.native
  def parse(jobId: Double, autoStart: js.Any): js.Promise[Response] = js.native
  def results(jobId: Double, query: js.Any): js.Promise[Response] = js.native
  def search(query: js.Any): js.Promise[Response] = js.native
  def start(jobId: Double): js.Promise[Response] = js.native
  def start(jobId: Double, runSample: js.Any): js.Promise[Response] = js.native
  def status(jobId: Double): js.Promise[Response] = js.native
}

