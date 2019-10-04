package typings.pacote.pacoteMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearMemoized(): Unit = js.native
  /**
    * Extracts package data identified by `spec` into a directory named
    * `destination`, which will be created if it does not already exist.
    *
    * If `opts.digest` is provided and the data it identifies is present in the
    * cache, `extract` will bypass most of its operations and go straight to
    * extracting the tarball.
    */
  def extract(spec: String): js.Promise[Unit] = js.native
  def extract(spec: String, destination: String): js.Promise[Unit] = js.native
  def extract(spec: String, destination: String, opts: Options): js.Promise[Unit] = js.native
  /**
    * Fetches the manifest for a package. Manifest objects are similar and based on
    * the `package.json` for that package, but with pre-processed and limited
    * fields.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def manifest(spec: String): js.Promise[Manifest] = js.native
  def manifest(spec: String, opts: Options): js.Promise[Manifest] = js.native
  /**
    * Fetches the packument for a package. Packument objects are general metadata
    * about a project corresponding to registry metadata, and include version and
    * `dist-tag` information about a package's available versions, rather than a
    * specific version. It may include additional metadata not usually available
    * through the individual package metadata objects.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def packument(spec: String): js.Promise[Packument] = js.native
  def packument(spec: String, opts: Options): js.Promise[Packument] = js.native
  /**
    * @deprecated * **THIS API IS DEPRECATED. USE pacote.tarball() INSTEAD**
    *
    * Fetches package data identified by `spec`, usually for the purpose of warming
    * up the local package cache (with `opts.cache`). It does not return anything.
    */
  def prefetch(spec: String): js.Promise[Unit] = js.native
  def prefetch(spec: String, opts: Options): js.Promise[Unit] = js.native
  /**
    * Fetches package data identified by `spec` and returns the data as a buffer.
    */
  def tarball(spec: String): js.Promise[Buffer] = js.native
  def tarball(spec: String, opts: Options): js.Promise[Buffer] = js.native
}

