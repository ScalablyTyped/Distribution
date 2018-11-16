```
// Type definitions for nes 7.0.0
// Project: https://github.com/hapijs/nes
// Definitions by: Ivo Stratev <https://github.com/NoHomey>
//                 Rodrigo Saboya <https://github.com/saboya>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Type definitions for nes 7.0.0
// Project: https://github.com/hapijs/nes
// Definitions by: Ivo Stratev <https://github.com/NoHomey>
//                 Rodrigo Saboya <https://github.com/saboya>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/* + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +
 +                                                                           +
 +                                                                           +
 +                                                                           +
 +                      WARNING: BACKWARDS INCOMPATIBLE                      +
 +                                                                           +
 +                                                                           +
 +                                                                           +
 + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + *
 *
 * Removal of Nes.Server.  No longer need to cast to Nes.Server as Hapi.Server
 *      has been modified directly.
 * Removal of Nes.Request.  Same reason as Nes.Server
 * Move Nes.Socket from class to just an interface as it is not mentioned
 *      publically in docs.  Perhaps this should be included though?  Add
 *      failing test demonstrating use if so.
 */

```