package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SafeBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@js.native
trait SafeBag[T /* <: BagType */]
  extends StObject
     with PkiObject
     with ISafeBag[T]
