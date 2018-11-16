package typings
package objectDashPathLib.ObjectPathGlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectPathBound[T /* <: js.Object */] extends js.Object {
  /*======== Coalesce =========*/
  /**
           * @see objectPath.ensureExists
           */
  def coalesce[TResult](paths: IMultiArray): TResult = js.native
  /*======== Coalesce =========*/
  /**
           * @see objectPath.ensureExists
           */
  def coalesce[TResult](paths: IMultiArray, defaultValue: TResult): TResult = js.native
  /**
           * @see objectPath.del
           */
  def del(): T = js.native
  /*======== Del =========*/
  
  /**
           * @see objectPath.ensureExists
           */
  def del(path: IPath): T = js.native
  /**
           * @see objectPath.empty
           */
  def empty(): T = js.native
  /*======== Empty =========*/
  /**
           * @see objectPath.ensureExists
           */
  def empty(path: IPath): T = js.native
  /**
           * @see objectPath.ensureExists
           */
  def ensureExists(): T = js.native
  /*======== EnsureExists =========*/
  /**
           * @see objectPath.ensureExists
           */
  def ensureExists[TExisting](path: IPath, value: js.Any): TExisting = js.native
  /**
           * @see objectPath.get
           */
  def get(): T = js.native
  /*======== Get =========*/
  /**
           * @see objectPath.ensureExists
           */
  def get[TResult](path: IPath): TResult = js.native
  /*======== Get =========*/
  /**
           * @see objectPath.ensureExists
           */
  def get[TResult](path: IPath, defaultValue: TResult): TResult = js.native
  /**
           * @see objectPath.has
           */
  def has(): scala.Boolean = js.native
  /*======== Has =========*/
  /**
           * @see objectPath.ensureExists
           */
  def has(path: IPath): scala.Boolean = js.native
  /*======== Insert =========*/
  /**
           * @see objectPath.insert
           */
  def insert(path: IPath, value: js.Any): scala.Unit = js.native
  /*======== Insert =========*/
  /**
           * @see objectPath.insert
           */
  def insert(path: IPath, value: js.Any, at: scala.Double): scala.Unit = js.native
  /**
           * @see objectPath.push
           */
  def push(): scala.Unit = js.native
  /*======== Push =========*/
  /**
           * @see objectPath.ensureExists
           */
  def push(path: IPath, args: js.Any*): scala.Unit = js.native
  /**
           * @see objectPath.set
           */
  def set(): T = js.native
  /*======== Set =========*/
  /**
           * @see objectPath.ensureExists
           */
  def set[TExisting](path: IPath, value: js.Any): TExisting = js.native
  /*======== Set =========*/
  /**
           * @see objectPath.ensureExists
           */
  def set[TExisting](path: IPath, value: js.Any, doNotReplace: scala.Boolean): TExisting = js.native
}

