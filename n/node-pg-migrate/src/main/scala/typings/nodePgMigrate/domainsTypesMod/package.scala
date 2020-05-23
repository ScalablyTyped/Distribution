package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object domainsTypesMod {
  type AlterDomain = js.Function2[
    /* domainName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* domainOptions */ typings.nodePgMigrate.domainsTypesMod.DomainOptionsAlter, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateDomain = typings.nodePgMigrate.domainsTypesMod.CreateDomainFn with typings.nodePgMigrate.anon.Reverse
  type CreateDomainFn = js.Function3[
    /* domainName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* type */ typings.nodePgMigrate.generalTypesMod.Type, 
    /* domainOptions */ js.UndefOr[
      typings.nodePgMigrate.domainsTypesMod.DomainOptionsCreate with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropDomain = js.Function2[
    /* domainName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameDomain = typings.nodePgMigrate.domainsTypesMod.RenameDomainFn with typings.nodePgMigrate.anon.ReverseRenameDomainFn
  type RenameDomainFn = js.Function2[
    /* oldDomainName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newDomainName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
