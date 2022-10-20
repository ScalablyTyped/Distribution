package typings.npmcliArborist

import typings.npmcliArborist.mod.SaveType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmcliArboristStrings {
  
  @js.native
  sealed trait ADD extends StObject
  inline def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait CHANGE extends StObject
  inline def CHANGE: CHANGE = "CHANGE".asInstanceOf[CHANGE]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DETACHED extends StObject
  inline def DETACHED: DETACHED = "DETACHED".asInstanceOf[DETACHED]
  
  @js.native
  sealed trait INVALID extends StObject
  inline def INVALID: INVALID = "INVALID".asInstanceOf[INVALID]
  
  @js.native
  sealed trait MISSING extends StObject
  inline def MISSING: MISSING = "MISSING".asInstanceOf[MISSING]
  
  @js.native
  sealed trait `PEER LOCAL` extends StObject
  inline def `PEER LOCAL`: `PEER LOCAL` = ("PEER LOCAL").asInstanceOf[`PEER LOCAL`]
  
  @js.native
  sealed trait REMOVE extends StObject
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait advisory extends StObject
  inline def advisory: advisory = "advisory".asInstanceOf[advisory]
  
  @js.native
  sealed trait dev
    extends StObject
       with SaveType
  inline def dev: dev = "dev".asInstanceOf[dev]
  
  @js.native
  sealed trait metavuln extends StObject
  inline def metavuln: metavuln = "metavuln".asInstanceOf[metavuln]
  
  @js.native
  sealed trait optional
    extends StObject
       with SaveType
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait peer
    extends StObject
       with SaveType
  inline def peer: peer = "peer".asInstanceOf[peer]
  
  @js.native
  sealed trait peerOptional
    extends StObject
       with SaveType
  inline def peerOptional: peerOptional = "peerOptional".asInstanceOf[peerOptional]
  
  @js.native
  sealed trait prod
    extends StObject
       with SaveType
  inline def prod: prod = "prod".asInstanceOf[prod]
}
