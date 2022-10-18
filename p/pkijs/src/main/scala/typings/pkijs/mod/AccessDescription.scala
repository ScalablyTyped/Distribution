package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AccessDescription structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  *
  * The authority information access extension indicates how to access
  * information and services for the issuer of the certificate in which
  * the extension appears. Information and services may include on-line
  * validation services and CA policy data. This extension may be included in
  * end entity or CA certificates. Conforming CAs MUST mark this
  * extension as non-critical.
  */
@js.native
trait AccessDescription
  extends StObject
     with PkiObject
     with IAccessDescription
