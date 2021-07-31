package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A lightweight definiton for orientjs module, Official node.js driver for OrientDB.
  *
  * @param {orientjs.ServerConfig} config
  * @returns {orientjs.OServer}
  */
@scala.inline
def apply(config: typings.orientjs.mod.ServerConfig): typings.orientjs.mod.OServer = typings.orientjs.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.orientjs.mod.OServer]

type ODocument = typings.orientjs.mod.ORecord

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.orientjs.mod.ORawExpression
  - typings.orientjs.mod.OSqlFunction
*/
type OSqlExpression = typings.orientjs.mod._OSqlExpression | java.lang.String

type Version = scala.Double | java.lang.String
