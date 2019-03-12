package typings
package minioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minioMod {
  type NoResultCallback = js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  type Region = _Region | java.lang.String
  type ResultCallback[T] = js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ T, scala.Unit]
}
